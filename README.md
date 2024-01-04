# 【第4回】フレームワークを使ったプログラミング
## テーマ
1. 表示項目（エンティティ）の追加

## 開発環境について
* この演習では、Codespacesと呼ばれるサービスを使って開発を行います。
* ブラウザ上で動作する開発環境です、インストール不要で使う事ができます。

## Codespacesで実行してみよう
* 第一回で実施した[手順](/Codespacesの実行手順.md)を参照してください。

## フレームワークを使った表示項目（エンティティ）の追加について学習
1. `Let's try!`を押します。<br>
![image](https://user-images.githubusercontent.com/32722128/151936862-c78139f7-3343-42ab-ae46-9c95bc43b86b.png)

2. 学生の一覧が表示される事を確認しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/151936326-bfa8c95d-bc72-4fb1-a380-915fa5777ef1.png)

3. 確認が終わったら、タブを閉じましょう<br>
![image](https://user-images.githubusercontent.com/32722128/150733257-a1056c19-1b24-412b-8bfc-a6063e75c785.png)

4. デバック実行中ですので、停止ボタンを押して、デバック実行を停止しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/150748527-d7121765-5142-4f5a-9769-33c0c23627a4.png)

## 解説
### エンティティクラス
* 今回の演習で使用したStudentクラスはエンティティクラスとして作成しました。  
* エンティティクラスはデータベースから取得したデータを格納するオブジェクトのクラスとして作成します。  
* エンティティクラスは前回の演習問題で扱ったフォームクラスと同じようなクラス構造をしています。  
* エンティティクラス、フォームクラスのような、クラス継承が無い、シンプル構造のクラスから作られたオブジェクトをPOJOオブジェクトと呼ぶことがあります。  
* 本来では、データベースからデータを取得しエンティティクラスであるStudentクラスのオブジェクトを作成すべきですが、今回の演習は初級段階という事で、  
* データベースからデータを取得するのではなく、Controller内で疑似的にデータを入れ込み、一覧表示する手順を学びましょう。  

### 解説 Thymeleafの繰り返し文「th:each」
* HTMLのtableタグを使用し、学生の情報を一覧表示しています。<br>
![image](https://user-images.githubusercontent.com/32722128/152269231-97643ca6-2c0a-409b-b82e-5bd631ea86cd.png)
* tableタグを生成するためにThymeleafの繰り返し文「th:each」を使用しています。  
* `studentList`という変数名のList型のオブジェクトをThymeleafに渡してあげる事で、List内のオブジェクトを一つずつ取り出し、  
* tableタグ内のtrタグ、tdタグを生成しています。<br>
![image](https://user-images.githubusercontent.com/32722128/152269900-f8a62ce3-c917-49a7-b83d-4d360751d6df.png)
![image](https://user-images.githubusercontent.com/32722128/152269488-bd89d3fe-7f40-4c74-a644-9752fd4ccbe9.png)

## 演習level2 step4
1. STEP-4のページを開きます。<br>
![image](https://user-images.githubusercontent.com/32722128/151950072-872872aa-7f55-498e-9574-bc7d4f583a93.png)

2. 学籍番号、名前の後に、`所属学科`を追加してください。
* 表示する、学籍番号、名前、所属学科は例示の物以外でも構いません。<br>
![image](https://user-images.githubusercontent.com/32722128/151951330-c3911568-d510-45a9-93f6-ac0bd047cacc.png)

## ヒント
1. エンティティクラスに専攻学科項目を追加しましょう。  
* 編集先:`~/src/main/java/com/classroom/assignment/model/request/Student.java`

2. Thymeleafのテンプレートファイルに専攻学科項目を追加しましょう。  
* 編集先:`~/src/main/resources/templates/step4/index.html`  

3. Studentオブジェクトに専攻学科項目を追加しましょう。  
* 編集先:`~/src/main/java/com/classroom/assignment/controller/Step4Controller.java`

## テスト
* 提出前に回答があっているかテストしてみましょう。

1. `~/src/test/java/com/classroom/assignment/controller/api/Step4ControllerTests.java`を開きます。

2. クラス名の前の再生ボタンをクリックします。(画面コピーは一度テスト実施済みのためチェックマークに変わっています。)
![image](https://user-images.githubusercontent.com/32722128/151952985-1412b879-95ba-4848-84ed-17e621bc85d6.png)

3. 再生ボタンがチェックマークに変わればテスト成功です！

## 課題の提出
* 課題の提出は第一回と同じ[操作](/課題の提出手順.md)のコミット・プッシュ・プルリクエストを実施しましょう。
