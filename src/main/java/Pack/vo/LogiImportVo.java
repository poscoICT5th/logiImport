package Pack.vo;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class LogiImportVo {
	String instruction_no;
	String status;
	String lot_no;
	String item_code;
	String item_name;
	int order_amount;
	int im_amount;
	String unit;
	float weight;
	float width;
	float thickness;
	float height;
	String industry_family;
	String product_family;
	String location;
	String to_warehouse;
	String customer;
	String order_date;
	String inst_reg_date;
	String inst_deadline;
	String done_date;
}
