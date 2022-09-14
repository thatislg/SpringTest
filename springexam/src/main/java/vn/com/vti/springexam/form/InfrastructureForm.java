/**
 * 
 */
package vn.com.vti.springexam.form;

import java.util.Date;

/**
 * @author thatislg1720
 *
 */
public class InfrastructureForm {

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

	private String name;
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
