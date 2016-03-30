package com.andres_k.component.network.networkSend;


import com.andres_k.component.game.actions.EAnimation;
import com.andres_k.component.game.input.EInput;
import com.andres_k.component.network.networkSend.messageServer.*;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

/**
 * Created by andres_k on 11/03/2015.
 */

public class NetworkRegister {
    static public void register (EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
        kryo.register(MessageModel.class);
        kryo.register(MessageConnect.class);
        kryo.register(MessageDisconnect.class);
        kryo.register(MessageActionPlayer.class);
        kryo.register(MessageStatePlayer.class);
        kryo.register(MessageNewPlayer.class);
        kryo.register(MessageDeletePlayer.class);
        kryo.register(MessageGameLaunch.class);
        kryo.register(MessageGameEnd.class);
        kryo.register(MessageInputPlayer.class);
        kryo.register(MessageGameEnd.class);
        kryo.register(EAnimation.class);
        kryo.register(EInput.class);
    }
}
