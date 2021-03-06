/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.example.mydsl4test.otherDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl4test.otherDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OtherDslFactoryImpl extends EFactoryImpl implements OtherDslFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OtherDslFactory init()
	{
		try
		{
			OtherDslFactory theOtherDslFactory = (OtherDslFactory)EPackage.Registry.INSTANCE.getEFactory(OtherDslPackage.eNS_URI);
			if (theOtherDslFactory != null)
			{
				return theOtherDslFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OtherDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherDslFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case OtherDslPackage.OTHER_ROOT: return createOtherRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherRoot createOtherRoot()
	{
		OtherRootImpl otherRoot = new OtherRootImpl();
		return otherRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherDslPackage getOtherDslPackage()
	{
		return (OtherDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OtherDslPackage getPackage()
	{
		return OtherDslPackage.eINSTANCE;
	}

} //OtherDslFactoryImpl
