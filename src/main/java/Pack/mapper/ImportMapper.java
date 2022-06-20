package Pack.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import Pack.vo.TestVo;
import Pack.vo.LogiImportDTO;
import Pack.vo.LogiImportDeleteList;
import Pack.vo.LogiImportSearchDTO;
import Pack.vo.LogiImportVo;

@Repository
@Mapper
public interface ImportMapper {
    List<LogiImportVo> selectAll();
    
    LogiImportVo selectByInstNo(String instructionNo);

	int insert(LogiImportDTO logiImportDTO);
//	int insert(LogiImportVo logiImportDTO);

	List<LogiImportVo> selectSome(LogiImportSearchDTO logiImportSearchDTO);

	int delete(String instructionNo);

	int confirm(String instructionNo);

	int deletes(List logiImportDeleteList);

	LogiImportVo selectByLotNo(String lotNo);
}
