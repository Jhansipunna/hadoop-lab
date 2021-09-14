publicvoidclusterData(){	
	kmeans=newSimpleKMeans();
	kmeans.setSeed(10);
	try{
		kmeans.setPreserveInstancesOrder(true);
		kmeans.setNumClusters(10);
		kmeans.buildClusterer(cpu);
		int[] assignments =kmeans.getAssignments();
		int i =0;
		for(intclusterNum: assignments){
			System.out.printf("Instance %d -> Cluster %d\n", i,clusterNum);
			i++;
		}
	}catch(Exception e1){
	}
}
