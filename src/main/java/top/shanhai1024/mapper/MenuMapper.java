package top.shanhai1024.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<String> selectPermsByUserId(Long id);
}
