/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base2 Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBase2MeasurementRelationship()
 * @model
 * @generated
 */
public interface Base2MeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' container reference.
	 * @see #setFrom(BinaryMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBase2MeasurementRelationship_From()
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To
	 * @model opposite="baseMeasurement2To" required="true" transient="false"
	 * @generated
	 */
	BinaryMeasurement getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom <em>From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' container reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(BinaryMeasurement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement2From <em>Base Measurement2 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DimensionalMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getBase2MeasurementRelationship_To()
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement2From
	 * @model opposite="baseMeasurement2From" required="true"
	 * @generated
	 */
	DimensionalMeasurement getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DimensionalMeasurement value);

} // Base2MeasurementRelationship
