public class MatrixMultiply
{
public static void main(String[] args) throws Exception 
{
if(args.length!=2)
{
system.err.println("usage:MatrixMultiply<in_dir> <out_dir>");
system.exit(2);
}
Configuration conf=new Configuration();
conf.set("m","1000");
conf.set("n","100");
conf.set("p","1000");
@SupressWarnings("deprecation")
Job job=new Job(conf,"MatrixMultiply");
job.setJarByClass(MatrixMultiply.class);
job.setOutputKeyClass(Text.class);
job.setOutputValueClass(Text.class);

job.setMapperClass(Map.class);
job.setReducerClass(Reduce.class);

job.setInputFormatClass(TextInputFormat.class);
job.setOutputFormatClass(TextOutputFormat.class);

FileInputFormat.addInputPath(job,new Path(args[0]));
FileOutputFormat.addOutputPath(job,new Path(args[1]));

job.waitForCompletion(true);
}
}
