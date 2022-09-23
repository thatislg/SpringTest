/**
 * 
 */
package vn.com.vti.springexam.form;

import java.util.ArrayList;
import java.util.List;

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

	private Integer section3Id;
	
	private Integer section8Id;

	/**
	 * @return section8Id
	 */
	public Integer getSection8Id() {
		return section8Id;
	}
	/**
	 * @param section8Id セットする section8Id
	 */
	public void setSection8Id(Integer section8Id) {
		this.section8Id = section8Id;
	}
	/**
	 * @return section3Id
	 */
	public Integer getSection3Id() {
		return section3Id;
	}
	/**
	 * @param section3Id セットする section3Id
	 */
	public void setSection3Id(Integer section3Id) {
		this.section3Id = section3Id;
	}
	/**
	 * @return infrastructureIdList
	 */
	public List<Integer> getInfrastructureIdList() {
		return infrastructureIdList;
	}
	/**
	 * @param infrastructureIdList セットする infrastructureIdList
	 */
	public void setInfrastructureIdList(List<Integer> infrastructureIdList) {
		this.infrastructureIdList = infrastructureIdList;
	}
	private List<Integer> infrastructureIdList = new ArrayList<>();





}
