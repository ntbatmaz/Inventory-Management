/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

/**
 *
 * @author Taha
 */
public class Device {
 private String Name;
 private String Type;
 private String Value;
 private Integer Count;
 public Device(String n, String t, String v, Integer c)
 {
 Name = n;
 Type = t;
 Value = v;
 Count = c; 
 }    
 
 public String setName(){
     return this.Name;
 }
 public String setType(){
     return this.Type;
 }
  public String setValue(){
     return this.Value;
 }
  public Integer setCount(){
     return this.Count;
 }
   public String getName(){
        return this.Name;
 }
  public String getType(){
        return this.Type;
 }
  public String getValue(){
        return this.Value;
 }
  public Integer getCount(){
        return this.Count;
 }
    
}
