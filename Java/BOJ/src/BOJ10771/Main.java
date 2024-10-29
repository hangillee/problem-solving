package BOJ10771;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());

        List<Message> messages = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            messages.add(new Message(command, value));
        }

        int currentTime = 0;
        List<Friend> friends = new ArrayList<>();
        Map<Integer, Integer> results = new TreeMap<>();
        for (Message message : messages) {
            if (message.getCommand().equals("R")) {
                friends.add(new Friend(message.getValue(), currentTime));
                currentTime++;
            }
            if (message.getCommand().equals("S")) {
                for (Friend friend : friends) {
                    if (friend.getId() == message.getValue()) {
                        if (results.containsKey(friend.getId())) {
                            results.replace(friend.getId(), results.get(friend.getId()) + currentTime - friend.getStartSecond());
                        } else {
                            results.put(friend.getId(), currentTime - friend.getStartSecond());
                        }
                        friends.remove(friend);
                        break;
                    }
                }
                currentTime++;
            }
            if (message.getCommand().equals("W")) {
                currentTime += (message.getValue() - 1);
            }
        }

        for (Friend friend : friends) {
            results.replace(friend.getId(), -1);
            results.putIfAbsent(friend.getId(), -1);
        }

        StringBuilder resultString = new StringBuilder();
        for (int key : results.keySet()) {
            resultString.append(key)
                    .append(" ")
                    .append(results.get(key))
                    .append("\n");
        }

        bw.write(resultString.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static class Message {
        String command;
        int value;

        public Message(String command, int value) {
            this.command = command;
            this.value = value;
        }

        public String getCommand() {
            return command;
        }

        public int getValue() {
            return value;
        }
    }

    static class Friend {
        int id;
        int startSecond;

        public Friend(int id, int startSecond) {
            this.id = id;
            this.startSecond = startSecond;
        }

        public int getId() {
            return id;
        }

        public int getStartSecond() {
            return startSecond;
        }
    }
}
