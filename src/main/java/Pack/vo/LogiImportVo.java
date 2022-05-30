package Pack.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
public class LogiImportVo {
	String status;
	String location;
	String instruction_no;
	String product_family;
	String lot_no;
	String item_no;
	String item_name;
	String amount;
	String weight;
	String unit;
	String target;
	float width;
	float thickness;
	float height;
	int order_amount;
	int im_amount;
	String to_warehouse;
	String order_date;
	String inst_reg_date;
	String inst_deadline;
	String done_date;
}
