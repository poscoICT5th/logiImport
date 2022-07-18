package Pack.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResultDTO {
	Boolean result;
	
	public ResultDTO(int result) {
		this.result = result>0?true:false;
	}

}
