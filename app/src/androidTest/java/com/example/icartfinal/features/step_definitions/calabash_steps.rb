require 'calabash-android/calabash_steps'
When(/^I press "+ Nueva Lista"$/) do
  wait_for do
    !query("*").empty?
  end
Then /^I press "Frutas"$/ do
  press_Frutas_button
end
Then /^I press "Manzanas"$/ do
  press_Manzanas_button
end
Then /^I press "Aceptar"$/ do
  press_Aceptar_button
end
Then /^I press "Peras"$/ do
  press_Peras_button
end
Then /^I press "Cancelar"$/ do
  press_Cancelar_button
end
Then /^I press "Shopping List button"$/ do
  press_ShoppingList_button
end
Then /^I press "Manzanas"$/ do
  press_delete_Manzanas_button
end
Then /^I press "BORRAR TODO"$/ do
  press_Aceptar_button
end
Then /^I press "back button"$/ do
  press_back_button
end
Then /^I press "FeedBack button"$/ do
  press_back_button
end
Then /^I press "TextArea"$/ do
  touch("* marked:'Introduzca sus comentarios'")
  wait_for_keyboard
  keyboard_enter_text("Maravillosa aplicación")
end
Then /^I press "back button"$/ do
  press_back_button
end
Then /^I press "Submit button"$/ do
  press_Submit_button
end
Then /^I press "Modo noche button"$/ do
  press_NightMode_button
end
Then /^I press "Help button"$/ do
  press_Help_button
end
end