publicintclusterInstance(Instance instance)throwsException
{
if(processed_InstanceID>=database.size())processed_InstanceID=0;
intcnum=(database.getDataObject(Integer.toString(processed_InstanceID++))).getClusterLabel();
if(cnum==DataObject.NOISE)
thrownewException();
else
returncnum;
