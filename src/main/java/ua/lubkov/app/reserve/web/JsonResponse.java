package ua.lubkov.app.reserve.web;

public class JsonResponse {
	
	private boolean success = false;
	private int total = 0;
	private Object result = null;
	
	
	public JsonResponse() {}
	
	public JsonResponse(boolean success, int total, Object result) {
		super();
		
		this.success = success;
		this.total = total;
		this.result = result;
	}
	
	public Object getResult() {
		return result;
	}
	
	public void setResult(Object result) {
		this.result = result;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
