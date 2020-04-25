package ua.nure.sapetskykh.SummaryTask4.db.entity;
/**
 * Category entity.
 *
 *
 */
public class Category extends Entity {
		/**
	 * 
	 */
	private static final long serialVersionUID = -8547811272634737001L;
		private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category [name=" + name + ", Id=" + getId() + "]";
    }

}
