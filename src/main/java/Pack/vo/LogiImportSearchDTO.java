package Pack.vo;

import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString 
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class LogiImportSearchDTO {
	String status;
	String industry_family;
	String location;
	String product_family;
	String lot_no;
	String item_code;
	String item_name;
	String to_warehouse;
	String unit;
	float min_weight;
	float max_weight;
	float min_thickness;
	float max_thickness;
	float min_height;
	float max_height;
	int min_order_amount;
	int max_order_amount;
	int min_im_amount;
	int max_im_amount;
	double min_width;
	double max_width;
	String order_date;
	String customer;
	String inst_reg_date;
	String inst_deadline;
	String done_date;
	
	@Builder
	LogiImportSearchDTO() {
		
	}
}
