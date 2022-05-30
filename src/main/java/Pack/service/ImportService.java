package Pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.mapper.ImportMapper;
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

    public List<LogiImportVo> selectSome() {
    	return importMapper.selectSome();
    }

	public int insert(Object data) {
		LogiImportVo logiImportVo = null;
		return 1;
		//return importMapper.insert(logiImportVo);
	}

	public int delete(String instructionNo) {
		return importMapper.delete(instructionNo);
	}

	public int confirm(String instructionNo) {
		return importMapper.confirm(instructionNo);
	}
}
