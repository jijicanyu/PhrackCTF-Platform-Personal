package top.phrack.ctf.pojo;

import java.io.Serializable;

public class Categories implements Serializable{
	private static final long serialVersionUID = 1L;  
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.categories.id
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.categories.name
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.categories.mark
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    private String mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.categories.id
     *
     * @return the value of public.categories.id
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.categories.id
     *
     * @param id the value for public.categories.id
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.categories.name
     *
     * @return the value of public.categories.name
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.categories.name
     *
     * @param name the value for public.categories.name
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.categories.mark
     *
     * @return the value of public.categories.mark
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.categories.mark
     *
     * @param mark the value for public.categories.mark
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
    
    @Override
    public int hashCode() {
        return id.intValue();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categories other = (Categories) obj;
        if (id != other.id)
            return false;
        return true;
    }
}