package cn.edu.guet.mapper;

import cn.edu.guet.bean.Tree;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface TreeMapper {
    List<Tree> getAllTree();
}
