package task4CleanCode;
public class ConstructionCost {
	public double CalculateConstructionCost(String StandardMaterial,double Housearea)
	  {
	 double con_cost=0.0;
	 if(StandardMaterial=="Standard")
	 {
	 int StandardMaterialcost=1200;
	 con_cost=StandardMaterialcost*Housearea;
	 }
	 else if(StandardMaterial=="AboveStandard")
	 {
	 int StandardMaterialcost=1500;
	 con_cost=StandardMaterialcost*Housearea;
	 }
	 else if(StandardMaterial=="HighStandard")
	 {
	 int StandardMaterialcost=1800;
	 con_cost=StandardMaterialcost*Housearea;
	 }
	 else if(StandardMaterial=="FullyAutomated")
	 {
	 int StandardMaterialcost=2500;
	 con_cost=StandardMaterialcost*Housearea;
	 }
	 return con_cost;
	  }
}
