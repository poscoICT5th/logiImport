package Pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.mapper.ImportMapper;
import Pack.vo.LogiImportDTO;
import Pack.vo.LogiImportSearchDTO;
import Pack.vo.LogiImportVo;

@Service
public class ImportService {
    @Autowired
    public ImportMapper importMapper;

    public List<LogiImportVo> selectAll() {
        return importMapper.selectAll();
    }
    
    public LogiImportVo selectByInstNo() {
    	return importMapper.selectByInstNo();
    }

    public List<LogiImportVo> selectSome(LogiImportSearchDTO logiImportSearchDTO) {
    	return importMapper.selectSome(logiImportSearchDTO);
    }

	public int insert(LogiImportDTO logiImportDTO) {
//		logiImportVo.setStatus("입고예정");
		
//		return 1;
		System.out.println(4444);
		System.out.println(logiImportDTO);
		return importMapper.insert(logiImportDTO);
	}

//	public int insert(LogiImportVo logiImportDTO) {
////		logiImportVo.setStatus("입고예정");
//		
////		return 1;
//		System.out.println(4444);
//		System.out.println(logiImportDTO);
//		return importMapper.insert(logiImportDTO);
//	}

	public int delete(String instructionNo) {
		return importMapper.delete(instructionNo);
	}

	public int confirm(String instructionNo) {
		return importMapper.confirm(instructionNo);
	}
}
