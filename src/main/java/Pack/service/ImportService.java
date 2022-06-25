package Pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.mapper.ImportMapper;
import Pack.vo.LogiImportDTO;
import Pack.vo.LogiImportList;
import Pack.vo.LogiImportSearchDTO;
import Pack.vo.LogiImportVo;

@Service
public class ImportService {
    @Autowired
    public ImportMapper importMapper;

    public List<LogiImportVo> selectAll() {
        return importMapper.selectAll();
    }
    
    public LogiImportVo selectByInstNo(String instructionNo) {
    	return importMapper.selectByInstNo(instructionNo);
    }

    public List<LogiImportVo> selectSome(LogiImportSearchDTO logiImportSearchDTO) {
    	return importMapper.selectSome(logiImportSearchDTO);
    }

	public int insert(List<LogiImportDTO> logiImportDTO) {
		System.out.println(4444);
		System.out.println(logiImportDTO);
		return importMapper.insert(logiImportDTO);
	}

	public int delete(String instructionNo) {
		return importMapper.delete(instructionNo);
	}

	public int confirm(String instructionNo) {
		return importMapper.confirm(instructionNo);
	}

	public int deletes(LogiImportList logiImportList) {
		return importMapper.deletes(logiImportList.getLogiImportList());
	}

	public LogiImportVo selectByLotNo(String lotNo) {
		return importMapper.selectByLotNo(lotNo);
	}

	public int cancels(LogiImportList logiImportList) {
		return importMapper.cancels(logiImportList.getLogiImportList());
	}

	public int rollback(LogiImportList logiImportList) {
		return importMapper.rollback(logiImportList.getLogiImportList());
	}
}
