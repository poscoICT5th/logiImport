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
    	System.out.println(1111);
        return importMapper.selectAll();
    }
}
