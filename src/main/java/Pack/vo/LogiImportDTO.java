package Pack.vo;

import java.text.SimpleDateFormat;

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
public class LogiImportDTO {
	String status;
	String industry_family;
	String location;
	String instruction_no;
	String product_family;
	String lot_no;
	String item_code;
	String item_name;
	float weight;
	String unit;
	String customer;
	double width;
	float thickness;
	float height;
	int order_amount;
	int im_amount;
	String to_warehouse;
	String order_date;
	String inst_reg_date;
	String inst_deadline;
	String done_date;
	public LogiImportDTO(String industry_family, String location, String product_family, String item_code, String item_name,
			float weight, String unit, String customer, double width, float thickness, float height, int order_amount,
			int im_amount, String to_warehouse, String order_date, String inst_deadline) {
		System.out.println("여기들어옴");
		this.item_code = item_code;
		this.item_name = item_name;
		this.order_amount = order_amount;
		this.im_amount = im_amount;
		this.unit = unit;
		this.weight = weight;
		this.width = width;
		this.thickness = thickness;
		this.height = height;
		this.industry_family = industry_family;
		this.product_family = product_family;
		this.location = location;
		this.to_warehouse = to_warehouse;
		this.customer = customer;
		this.order_date = order_date;
		this.inst_deadline = inst_deadline;
		this.status = "입고예정";
		long curTime = System.currentTimeMillis();
		String makeDate = new SimpleDateFormat("YYMMddHHmmssms").format(curTime);
		this.instruction_no = makeDate;
		this.lot_no = product_family + makeDate;
		this.inst_reg_date = new SimpleDateFormat("YYYY-MM-dd").format(curTime);
	}
	
	
}
