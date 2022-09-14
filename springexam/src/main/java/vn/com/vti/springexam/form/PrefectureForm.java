/**
 * 
 */
package vn.com.vti.springexam.form;

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
	private Integer id;
	private String name;
	private Integer population;
	
}
