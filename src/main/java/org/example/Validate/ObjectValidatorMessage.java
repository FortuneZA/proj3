package org.example.Validate;

public class ObjectValidatorMessage {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static String MSG_ERROR = "erorr";
    public static String MSG_SYSTEM = "system";

    private String errType;
    private String msg;
    private String fieldName;

    public ObjectValidatorMessage(String errType, String msg) {
        super();
        this.errType = errType;
        this.msg = msg;
    }

    public ObjectValidatorMessage(String errType, String msg, String fieldName) {
        super();
        this.errType = errType;
        this.msg = msg;
        this.fieldName = fieldName;
    }

    public String getErrType() {
        return errType;
    }

    public String getMsg() {
        return msg;
    }

    public String getFieldName() {
        return fieldName;
    }
}
