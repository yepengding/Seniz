package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.common.Value;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.TypeException;

/**
 * Literal Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class LiteralVisitor extends SenizParserBaseVisitor<Value> {

    @Override
    public Value visitNumberLiteral(SenizParser.NumberLiteralContext ctx) {
        String prefix = "";
        if (ctx.prefix != null) {
            prefix = ctx.prefix.getText();
        }
        NumberLiteralVisitor numberLiteralVisitor = new NumberLiteralVisitor(prefix);
        return ctx.accept(numberLiteralVisitor);
    }

    @Override
    public Value visitBooleanLiteral(SenizParser.BooleanLiteralContext ctx) {
        boolean value;
        String literal = ctx.getText();
        if (literal.equals("true")) {
            value = true;
        } else if (literal.equals("false")) {
            value = false;
        } else {
            throw new TypeException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported Boolean primaryType.");
        }
        return new Value(PrimaryType.BOOLEAN, value);
    }

    @Override
    public Value visitStringLiteral(SenizParser.StringLiteralContext ctx) {
        return new Value(PrimaryType.STRING, ctx.getText());
    }

    @Override
    public Value visitOtherLiteral(SenizParser.OtherLiteralContext ctx) {
        return null;
    }

    private static class NumberLiteralVisitor extends SenizParserBaseVisitor<Value> {

        private final String prefix;

        NumberLiteralVisitor(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public Value visitIntegerLiteral(SenizParser.IntegerLiteralContext ctx) {

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
                throw new TypeException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported Integer primaryType.");
            }

            return new Value(PrimaryType.INTEGER, value);
        }

        @Override
        public Value visitFloatLiteral(SenizParser.FloatLiteralContext ctx) {
            String literal = prefix + ctx.getText();

            // TODO maybe double
            float value;

            if (ctx.FLOAT_LITERAL() != null) {
                value = Float.parseFloat(literal);
            } else if (ctx.HEX_FLOAT_LITERAL() != null) {
                value = Float.intBitsToFloat(Integer.decode(literal));
            } else {
                throw new TypeException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported Float primaryType.");
            }

            return new Value(PrimaryType.FLOAT, value);
        }

    }


}
