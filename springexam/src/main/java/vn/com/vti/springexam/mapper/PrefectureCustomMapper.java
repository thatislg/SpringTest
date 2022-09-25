/**
 * 
 */
package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;

/**
 * @author lethihuongthuy
 *
 */
public interface PrefectureCustomMapper {
    List<Prefecture> selectPrefectureByName(String name);
}
