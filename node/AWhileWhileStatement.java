/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AWhileWhileStatement extends PWhileStatement
{
    private TWhile _while_;
    private PExpression _expression_;
    private TDo _do_;
    private PStatement _statement_;

    public AWhileWhileStatement()
    {
        // Constructor
    }

    public AWhileWhileStatement(
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TDo _do_,
        @SuppressWarnings("hiding") PStatement _statement_)
    {
        // Constructor
        setWhile(_while_);

        setExpression(_expression_);

        setDo(_do_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new AWhileWhileStatement(
            cloneNode(this._while_),
            cloneNode(this._expression_),
            cloneNode(this._do_),
            cloneNode(this._statement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileWhileStatement(this);
    }

    public TWhile getWhile()
    {
        return this._while_;
    }

    public void setWhile(TWhile node)
    {
        if(this._while_ != null)
        {
            this._while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._while_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TDo getDo()
    {
        return this._do_;
    }

    public void setDo(TDo node)
    {
        if(this._do_ != null)
        {
            this._do_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._do_ = node;
    }

    public PStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(PStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._while_)
            + toString(this._expression_)
            + toString(this._do_)
            + toString(this._statement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._while_ == child)
        {
            this._while_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._do_ == child)
        {
            this._do_ = null;
            return;
        }

        if(this._statement_ == child)
        {
            this._statement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._do_ == oldChild)
        {
            setDo((TDo) newChild);
            return;
        }

        if(this._statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
