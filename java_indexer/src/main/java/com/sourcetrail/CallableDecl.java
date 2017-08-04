package com.sourcetrail;

import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.Type;

public interface CallableDecl
{
	public BodyDeclaration getWrappedNode();
	public boolean isMethod();
	public String getName();
	public NodeList<TypeParameter> getTypeParameters();
	public NodeList<Parameter> getParameters();
	public Type getType();
	public boolean isStatic();
}
