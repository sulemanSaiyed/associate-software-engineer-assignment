function addTask() {
  const taskInput = document.getElementById("taskInput");
  const taskList = document.getElementById("taskList");

  if (taskInput.value.trim() === "") return;

  const li = document.createElement("li");
  li.textContent = taskInput.value;

  const btn = document.createElement("button");
  btn.textContent = "Remove";
  btn.onclick = () => li.remove();

  li.appendChild(btn);
  taskList.appendChild(li);
  taskInput.value = "";
}
