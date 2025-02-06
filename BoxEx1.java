Box(Box ob){ // pass object to constructor
    width = ob.width;
height = ob.height;
depth = ob.depth;
}

Box mybox1 = new Box(10,20,15);
Box mybox2 = new Box();
Box mycube = new Box(7);

Box myclone = new Box(mybox1); //