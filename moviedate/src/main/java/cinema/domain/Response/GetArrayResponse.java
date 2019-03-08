package cinema.domain.Response;

import java.util.ArrayList;
import java.util.List;

public class GetArrayResponse<T> extends BaseResponse {

    private List<T> rows;

    public GetArrayResponse() {
        super();
        this.rows = new ArrayList<>();
    }

    public GetArrayResponse(List<T> rows, String message, int code) {
        super(code, message);
        this.rows = rows;
    }


    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public void setSuccess(List<T> rows) {
        super.setSuccess();
        this.rows = rows;
    }

    public void setResult(List<T> rows) {
        setResult(rows,"items not found");
    }

    public void setResult(List<T> rows,  String msgNotfound) {
        if (rows != null && !rows.isEmpty()) {
            super.setSuccess();
            this.rows = rows;
        } else {
            super.setItemNotFound(msgNotfound);
        }
    }



    public String baseInfo() {
        return "{"
                + "rc=" + rc
                + ", rd='" + rd + '\''
                + '}';
    }

    @Override
    public String toString() {
        return "GetArrayResponse{" +
                ", rows=" + rows +
                ", rc=" + rc +
                ", rd='" + rd + '\'' +
                '}';
    }
}
