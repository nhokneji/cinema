//package cinema.security;
//
//import cinema.security.jwt.JwtUser;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//
//public class JwtValidator {
//	public JwtUser validate(String token) {
//		JwtUser jwtUser = null;
//		Claims claims = null;
//		try {
//			claims = Jwts.parser().setSigningKey("SECRET").parseClaimsJws(token).getBody();
//			jwtUser = new JwtUser();
//			jwtUser.setUsername(claims.getSubject());
//			jwtUser.setUserid(Integer.parseInt(claims.get("userid").toString()));
////			jwtUser.setPassword(claims.get("password").toString());
//			jwtUser.setRoles(Integer.parseInt(claims.get("roles").toString()));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return jwtUser;
//	}
//
//}
