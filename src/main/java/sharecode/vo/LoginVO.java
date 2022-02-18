package sharecode.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginVO {
	private int user_no;
	private String USER_ID;
	private String USER_PW;
	private String USER_MAIL;
	private String USER_DATE;
}
