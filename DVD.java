public class DVD {
            private String title;
            private String director;
            private int length;
            private float cost;
            private String category;
			public String getCategory() {
				return category;
			}
			public void setCategory(String category) {
				this.category = category;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getDirector() {
				return director;
			}
			public void setDirector(String director) {
				this.director = director;
			}
			public int getLength() {
				return length;
			}
			public void setLength(int length) {
				this.length = length;
			}
			public float getCost() {
				return cost;
			}
			public void setCost(float cost) {
				this.cost = cost;
			}
			public DVD(String title) {
				super();
				this.title = title;
			}
			public DVD(String title, float cost, String category) {
				super();
				this.title = title;
				this.cost = cost;
				this.category = category;
			}
			public DVD(String title, String director, float cost, String category) {
				super();
				this.title = title;
				this.director = director;
				this.cost = cost;
				this.category = category;
			}
			public DVD(String title, String director, int length, float cost, String category) {
				super();
				this.title = title;
				this.director = director;
				this.length = length;
				this.cost = cost;
				this.category = category;
			}
            
        }
