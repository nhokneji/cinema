package cinema.controller;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

public abstract class Handler implements HttpHandler {

	@Override
	public void handle(HttpExchange xchg) throws IOException {
		Headers headers = xchg.getRequestHeaders();
		String method = xchg.getRequestMethod();
		URI uri = xchg.getRequestURI();
		System.out.println("uri = " + uri.toString());
		String response = null;
		JSONObject jsObj = new JSONObject();
		int a = 0;
		try {
//			JwtValidator jwtVal = new JwtValidator();
//			jsObj = getRequestBody(xchg);
//			String token = requetsHeader(xchg);
//			if(token != null) {
//				Account acc = jwtVal.validate(token);
//				if (method!=null) {
//					response = doProcessGet(uri.toString());
//				} else {
					response = doProcessPost(jsObj, a);
//				}
//			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//		} catch (ParseException e) {
//			System.out.println(e.getMessage());
//		} catch (MalformedJwtException e) {
//			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sendResp(xchg, response);
	}

//	public abstract String doProcessGet(String param);

	public abstract String doProcessPost(JSONObject params, int accId);
	// public abstract String doProcessPost(JSONObject params);

	private JSONObject getRequestBody(HttpExchange xchg) throws IOException, ParseException {
		InputStream ins = xchg.getRequestBody();
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = ins.read(buffer)) != -1) {
			result.write(buffer, 0, length);
		}
		String data = result.toString("UTF-8");
		if (data == null || data.isEmpty()) {
			return null;
		}
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(data);

		return obj;
	}

	private void sendResp(HttpExchange xchg, String resp) throws IOException {
		if (xchg == null) {
			return;
		}
		xchg.sendResponseHeaders(200, resp.getBytes("UTF-8").length);
		try (OutputStream os = xchg.getResponseBody()) {
			os.write(resp.getBytes("UTF-8"));
		}
	}

	// private String getToken(JSONObject jsObj) {
	// if (jsObj == null) {
	// return null;
	// }
	// try {
	// String token = (String) jsObj.get("token");
	// return token;
	// } catch (Exception ex) {
	// }
	// return null;
	// }

	//
//	protected String requetsHeader(HttpExchange headersEx) {
//		String token = null;
//		Account jwtAcc = Account.getInstance();
//		Headers requestHeaders = headersEx.getRequestHeaders();
//
//		for (Map.Entry<String, List<String>> header : requestHeaders.entrySet()) {
//			String key = header.getKey();
//			List<String> value = header.getValue();
//
//			if (key.equals("Token")) {
//				token = value.get(0);
//				// jwtUser = jwt.validate(token);
//				return token;
//			}
//		}
//		return "";
//	}

}
