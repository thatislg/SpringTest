/**
 * 
 */
package vn.com.vti.springexam.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author thatislg1720
 *
 */
public class PrefectureForm {
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
	 * @return population
	 */
	public Integer getPopulation() {
		return population;
	}
	/**
	 * @param population セットする population
	 */
	public void setPopulation(Integer population) {
		this.population = population;
	}
	@NotNull
	private Integer id;
	
	@NotBlank
	private String name;
	@NotNull
	private Integer population;
	
}
