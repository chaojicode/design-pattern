package com.chaojicode;

public class PerfectEngineAdapter implements Engine {
    private VirtualEngine virtualEngine;
    @Override
    public void run(String type) {
        if ("vr".equals(type)){
            virtualEngine = new VREngine();
            virtualEngine.simulate();
        }else if ("computer".equals(type)){
            virtualEngine = new ComputerEngine();
            virtualEngine.simulate();
        }
    }
}
