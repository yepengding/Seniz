package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.TypeException;

public class LiteralVisitor extends SenizParserBaseVisitor<Object> {

    @Override
    public Object visitNumberLiteral(SenizParser.NumberLiteralContext ctx) {
        String prefix = "";
        if (ctx.prefix != null) {
            prefix = ctx.prefix.getText();
        }
        NumberLiteralVisitor numberLiteralVisitor = new NumberLiteralVisitor(prefix);
        return ctx.accept(numberLiteralVisitor);
    }

    @Override
    public Object visitBooleanLiteral(SenizParser.BooleanLiteralContext ctx) {
        boolean value;
        String literal = ctx.getText();
        if (literal.equals("true")) {
            value = true;
        } else if (literal.equals("false")) {
            value = false;
        } else {
            throw new TypeException(ctx.start.getLine(), "Unsupported Boolean type.");
        }
        return value;
    }

    @Override
    public Object visitStringLiteral(SenizParser.StringLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitOtherLiteral(SenizParser.OtherLiteralContext ctx) {
        return null;
    }

    private static class NumberLiteralVisitor extends SenizParserBaseVisitor<Object> {

        private final String prefix;

        NumberLiteralVisitor(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public Object visitIntegerLiteral(SenizParser.IntegerLiteralContext ctx) {

            String literal = prefix + ctx.getText();

            // TODO maybe long
            int value;

            if (ctx.DECIMAL_LITERAL() != null) {
                value = Integer.parseInt(literal);
            } else if (ctx.BINARY_LITERAL() != null) {
                value = Integer.parseInt(literal, 2);
            } else if (ctx.OCT_LITERAL() != null) {
                value = Integer.parseInt(literal, 8);
            } else if (ctx.HEX_LITERAL() != null) {
                value = Integer.decode(literal);
            } else {
                throw new TypeException(ctx.start.getLine(), "Unsupported Integer type.");
            }

            return value;
        }

        @Override
        public Object visitFloatLiteral(SenizParser.FloatLiteralContext ctx) {
            String literal = prefix + ctx.getText();

            // TODO maybe double
            float value;

            if (ctx.FLOAT_LITERAL() != null) {
                value = Float.parseFloat(literal);
            } else if (ctx.HEX_FLOAT_LITERAL() != null) {
                value = Float.intBitsToFloat(Integer.decode(literal));
            } else {
                throw new TypeException(ctx.start.getLine(), "Unsupported Float type.");
            }

            return value;
        }

    }


}
