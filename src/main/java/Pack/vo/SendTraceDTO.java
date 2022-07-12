package Pack.vo;

import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Setter
public class SendTraceDTO {
	String lot_no;
	String item_name;
	String item_code;
	int amount;
	String stock_quality_status;
	String status_cause;
	String inventory_date;
	List<ItemInfo> consumed_infos;
	
	public SendTraceDTO(LogiImportVo importConfirmData) {
		this.lot_no = importConfirmData.getLot_no();
		this.item_name = importConfirmData.getItem_name();
		this.item_code = importConfirmData.getItem_code();
		this.amount = importConfirmData.getIm_amount();
		this.inventory_date = importConfirmData.getDone_date();
		this.consumed_infos = Collections.EMPTY_LIST;
	}
}
