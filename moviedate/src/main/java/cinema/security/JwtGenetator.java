//package cinema.security;
//
//import cinema.security.jwt.JwtUser;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//
//public class JwtGenetator {
//	final String SECRET = "md-cinema";
//	 public String generate(JwtUser jwtUser) {
//	        Claims claims = Jwts.claims()
//	                .setSubject(jwtUser.getUsername());
//	        claims.put("userid", jwtUser.getUserid());
////	        claims.put("password", jwtUser.getPassword());
//	        claims.put("roles", jwtUser.getRoles());
//	        Date date = new Date();
//	        return Jwts.builder()
//	                .setClaims(claims)
//	                .signWith(SignatureAlgorithm.HS512, SECRET)
//	                .setIssuedAt(date)
//	                .setExpiration(new Date(date.getTime() + System.currentTimeMillis()))
//	                .compact();
//	    }
//}
