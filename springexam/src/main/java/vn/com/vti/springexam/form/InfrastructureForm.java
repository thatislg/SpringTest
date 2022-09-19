/**
 * 
 */
package vn.com.vti.springexam.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author thatislg1720
 *
 */
public class InfrastructureForm {
	@NotNull
	private Integer id;
	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return regisDate
	 */
	@NotNull
	@NotBlank
	private String name;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registDate;
	/**
	 * @return registDate
	 */
	public Date getRegistDate() {
		return registDate;
	}
	/**
	 * @param registDate セットする registDate
	 */
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	
}
