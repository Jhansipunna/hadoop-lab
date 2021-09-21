Arbitrarily choose k objects in D as the initial representative objects or seeds;
RepeatAssign each remaining object to the cluster with the nearest representative object;
Randomly select a no representative object, o random;Compute the total cost, S, of swapping representative object, oj, with o random;
If S < 0 then swap oj with o random to form the new set of k representative objects;
Until no change;Where E is the sum of the absolute error for all objects in the data set; 
p is the point in space representing a given object in cluster Cj; 
and oj is the representative object of Cj. In general, the algorithm iterates until, eventually, each representative object is actually the medoids, or most centrally located object, of its cluster. 
This is the basis of the k-medoids method for grouping n objects into k clusters.