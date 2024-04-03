package collectionlist;



public class StudentClg 
{

	
		private int SId;
        private String Name;
        private String Dept;
		public int getSId() {
			return SId;
		}
		public void setSId(int sId) {
			SId = sId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDept() {
			return Dept;
		}
		public void setDept(String dept) {
			Dept = dept;
		}
		public StudentClg(int sId, String name, String dept) {
			super();
			SId = sId;
			Name = name;
			Dept = dept;
		}
		@Override
		public String toString() {
			return "StudentClg [SId=" + SId + ", Name=" + Name + ", Dept=" + Dept + "]";
		}
        
        
      
      
      
      

}
