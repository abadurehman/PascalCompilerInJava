/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStart(AStart node);
    void caseASingleDeclarations(ASingleDeclarations node);
    void caseAIfThenStatementStatement(AIfThenStatementStatement node);
    void caseAIfThenElseStatementStatement(AIfThenElseStatementStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAAssignStatement(AAssignStatement node);
    void caseAPrintStatement(APrintStatement node);
    void caseANestedStatement(ANestedStatement node);
    void caseABreakStatement(ABreakStatement node);
    void caseAStatement(AStatement node);
    void caseAPrint(APrint node);
    void caseAAssignment(AAssignment node);
    void caseABooleanType(ABooleanType node);
    void caseAIntegerType(AIntegerType node);
    void caseAComparisionExpr(AComparisionExpr node);
    void caseAExpr(AExpr node);
    void caseAPlusExpr2(APlusExpr2 node);
    void caseAMinusExpr2(AMinusExpr2 node);
    void caseAOrExpr2(AOrExpr2 node);
    void caseAXorExpr2(AXorExpr2 node);
    void caseAExpr2(AExpr2 node);
    void caseAModExpr3(AModExpr3 node);
    void caseAMultExpr3(AMultExpr3 node);
    void caseADivExpr3(ADivExpr3 node);
    void caseAAndExpr3(AAndExpr3 node);
    void caseAExpr3(AExpr3 node);
    void caseANotExpr4(ANotExpr4 node);
    void caseANumberExpr4(ANumberExpr4 node);
    void caseAIdentifierExpr4(AIdentifierExpr4 node);
    void caseATrueExpr4(ATrueExpr4 node);
    void caseAFalseExpr4(AFalseExpr4 node);
    void caseAGtComparision(AGtComparision node);
    void caseAGeComparision(AGeComparision node);
    void caseALtComparision(ALtComparision node);
    void caseALeComparision(ALeComparision node);
    void caseANeComparision(ANeComparision node);
    void caseAEqComparision(AEqComparision node);
    void caseAIfThenStatement(AIfThenStatement node);
    void caseAIfThenElseStatement(AIfThenElseStatement node);
    void caseAIfThenElseStatementNoShortIf(AIfThenElseStatementNoShortIf node);
    void caseAIfStatementNoShortIf(AIfStatementNoShortIf node);
    void caseAWhileStatementNoShortIf(AWhileStatementNoShortIf node);
    void caseAWhileWhileStatementNoShortIf(AWhileWhileStatementNoShortIf node);
    void caseAWhileWhileStatement(AWhileWhileStatement node);

    void caseTInteger(TInteger node);
    void caseTBoolean(TBoolean node);
    void caseTVar(TVar node);
    void caseTNumber(TNumber node);
    void caseTAssign(TAssign node);
    void caseTBegin(TBegin node);
    void caseTProgramend(TProgramend node);
    void caseTEnd(TEnd node);
    void caseTProgram(TProgram node);
    void caseTIf(TIf node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTWriteln(TWriteln node);
    void caseTBreak(TBreak node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTEq(TEq node);
    void caseTLt(TLt node);
    void caseTGt(TGt node);
    void caseTLe(TLe node);
    void caseTGe(TGe node);
    void caseTNe(TNe node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTNot(TNot node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTColon(TColon node);
    void caseTSemikolon(TSemikolon node);
    void caseTDot(TDot node);
    void caseTWhitespace(TWhitespace node);
    void caseTIdentifier(TIdentifier node);
    void caseEOF(EOF node);
}
