package cinema.domain.Response;


public class SingleItemResponse<T> extends BaseResponse {

    private T item;

    public SingleItemResponse() {
    }

    public SingleItemResponse(T item) {
        this.item = item;
    }

    public SingleItemResponse(T item, String message, int code) {
        super(code, message);
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setSuccess(T item) {
        super.setSuccess();
        this.item = item;
    }

    public void setResult(T item) {
        setResult(item, "item not found");
    }

    public void setResult(T item, String errorMessage) {
        if (item == null) {
            super.setItemNotFound(errorMessage);
        } else {
            super.setSuccess();
            this.item = item;
        }
    }

    public String baseInfo() {
        return "{rc=" + rc + ", rd=" + rd + "}";
    }
}
