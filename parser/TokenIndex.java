/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import node.*;
import analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 0;
    }

    @Override
    public void caseTBoolean(@SuppressWarnings("unused") TBoolean node)
    {
        this.index = 1;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 2;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 3;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 4;
    }

    @Override
    public void caseTBegin(@SuppressWarnings("unused") TBegin node)
    {
        this.index = 5;
    }

    @Override
    public void caseTProgramend(@SuppressWarnings("unused") TProgramend node)
    {
        this.index = 6;
    }

    @Override
    public void caseTEnd(@SuppressWarnings("unused") TEnd node)
    {
        this.index = 7;
    }

    @Override
    public void caseTProgram(@SuppressWarnings("unused") TProgram node)
    {
        this.index = 8;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 9;
    }

    @Override
    public void caseTThen(@SuppressWarnings("unused") TThen node)
    {
        this.index = 10;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 11;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 12;
    }

    @Override
    public void caseTDo(@SuppressWarnings("unused") TDo node)
    {
        this.index = 13;
    }

    @Override
    public void caseTWriteln(@SuppressWarnings("unused") TWriteln node)
    {
        this.index = 14;
    }

    @Override
    public void caseTBreak(@SuppressWarnings("unused") TBreak node)
    {
        this.index = 15;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 16;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 17;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 18;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 19;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 20;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 21;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 22;
    }

    @Override
    public void caseTEq(@SuppressWarnings("unused") TEq node)
    {
        this.index = 23;
    }

    @Override
    public void caseTLt(@SuppressWarnings("unused") TLt node)
    {
        this.index = 24;
    }

    @Override
    public void caseTGt(@SuppressWarnings("unused") TGt node)
    {
        this.index = 25;
    }

    @Override
    public void caseTLe(@SuppressWarnings("unused") TLe node)
    {
        this.index = 26;
    }

    @Override
    public void caseTGe(@SuppressWarnings("unused") TGe node)
    {
        this.index = 27;
    }

    @Override
    public void caseTNe(@SuppressWarnings("unused") TNe node)
    {
        this.index = 28;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 29;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 30;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 31;
    }

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 32;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 33;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 34;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 35;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 36;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 37;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 38;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 39;
    }
}
