package cinema.domain.Response;

import cinema.common.ErrorCodeDefs;

public class BaseResponse {

    public BaseResponse(int rc, String rd) {
        this.rc = rc;
        this.rd = rd;
    }

    public BaseResponse() {
        rc = ErrorCodeDefs.UNKNOWN;
        rd = "UNKNOWN";
    }

    protected int rc;
    protected String rd;

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public void setSuccess() {
        this.rc = ErrorCodeDefs.ERR_CODE_OK;
        this.rd = "OK";
    }

    public void setFailed(String msg) {
        this.rc = ErrorCodeDefs.ERR_CODE_FAILED;
        this.rd = msg;
    }

    public void setFailed(int code, String msg) {
        this.rc = code;
        this.rd = msg;
    }

    public void setFailed() {
        this.setFailed("Action failed !");
    }

    public void setParamsInvalid() {
        this.setFailed(ErrorCodeDefs.ERR_CODE_PARAMS_INVALID, "Params invalid!");
    }

    public void setServerError() {
        this.setFailed(ErrorCodeDefs.ERR_CODE_SERVER_ERROR, "Server error!");
    }

    public void setItemNotFound(String msg) {
        this.rc = ErrorCodeDefs.ERR_CODE_ITEM_NOT_FOUND;
        this.rd = msg;
    }

    public void setItemNotFound() {
        this.setItemNotFound("items not found");
    }

    @Override
    public String toString() {
        return "{" +
                "rc=" + rc +
                ", rd='" + rd + '\'' +
                '}';
    }
}
