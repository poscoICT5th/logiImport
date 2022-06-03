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
	String location;
	String instruction_no;
	String product_family;
	String lot_no;
	String item_no;
	String item_name;
	int amount;
	float weight;
	String unit;
	String target;
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
	public LogiImportDTO(String location, String product_family, String item_no, String item_name, int amount,
			float weight, String unit, String target, double width, float thickness, float height, int order_amount,
			int im_amount, String to_warehouse, String order_date, String inst_deadline, String done_date) {
		this.location = location;
		this.product_family = product_family;
		this.item_no = item_no;
		this.item_name = item_name;
		this.amount = amount;
		this.weight = weight;
		this.unit = unit;
		this.target = target;
		this.width = width;
		this.thickness = thickness;
		this.height = height;
		this.order_amount = order_amount;
		this.im_amount = im_amount;
		this.to_warehouse = to_warehouse;
		this.order_date = order_date;
		this.inst_deadline = inst_deadline;
		this.done_date = done_date;
		this.status = "입고예정";
		System.out.println("여기들어옴");
		long curTime = System.currentTimeMillis();
		String makeDate = new SimpleDateFormat("YYMMddHHmmssms").format(curTime);
		this.lot_no = makeDate;
		this.inst_reg_date = new SimpleDateFormat("YYYY-MM-dd").format(curTime);
		this.instruction_no = makeDate;
	}
	
	
}
