package org.codehaus.yfaces.component;

/**
 * Raw, unprocessed and not validated configuration settings for a YComponent.
 * <p/>
 * Values are extracted from components view file during startup.
 * 
 * @author Denny Strietzbaum
 * 
 */
public interface YComponentConfig {

	static final String VAR_ATTRIBUTE = "var";
	static final String ID_ATTRIBUTE = "id";
	static final String MODEL_SPEC_ATTRIBUTE = "modelspec";
	static final String MODEL_IMPL_ATTRIBUTE = "model";
	static final String ERROR_ATTRIBUTE = "errorHandling";
	static final String PASS_TO_MODEL_ATTRIBUTE = "passToModel";

	/**
	 * Component id
	 * 
	 * @return configured id
	 */
	String getId();

	/**
	 * Returns the model specification as interface class literal.
	 * 
	 * @return name of interface
	 */
	String getModelSpecification();

	/**
	 * Returns the default model implementation as class literal.
	 * 
	 * @return class name
	 */
	String getModelImplementation();

	/**
	 * Returns the variable name under which an {@link YComponentHandler} instance is available in
	 * view.
	 * 
	 * @return variable name
	 */
	String getVariableName();

	/**
	 * Returns value for error handling (NONE,INFO,DEBUG,FINE)
	 * 
	 * @return
	 */
	String getErrorHandling();

	/**
	 * Returns passToModel properties as comma separated string.
	 * 
	 * @return
	 */
	String getPushProperties();

}
